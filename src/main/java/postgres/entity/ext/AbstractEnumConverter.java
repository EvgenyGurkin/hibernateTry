package postgres.entity.ext;

import javax.persistence.AttributeConverter;

/**
 * @author iGurkin
 */
public abstract class AbstractEnumConverter<T extends Enum<T> & PersistableEnum<E>, E> implements AttributeConverter<T, E> {

    private final Class<T> clazz;

    public AbstractEnumConverter(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public E convertToDatabaseColumn(T attribute) {
        return attribute != null ? attribute.getValue() : null;
    }

    @Override
    public T convertToEntityAttribute(E dbVal) {
        if (dbVal != null) {
            for (T e : clazz.getEnumConstants()) {
                if (e.getValue().equals(dbVal)) {
                    return e;
                }
            }
            valueNotFound(dbVal);
        }
        return null;
    }

    /**
     * Метод генерации исключения в случа, если оно не содержится в enum
     * можно определить свое поведение
     */
    public void valueNotFound(E dbVal) {
        final String msg = String.format("Converter %s receive unsupported value %s", this.getClass().getSimpleName(), dbVal);
        throw new UnsupportedOperationException(msg);
    }
}