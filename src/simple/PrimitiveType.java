package simple;

import lexems.ILexem;

public class PrimitiveType implements IType {
    String primitivetype;
    public PrimitiveType(String type){
        this.primitivetype = type;
    }

    @Override
    public String toString() {
        return "Primitive type{" +
                "primitive type=" + primitivetype + '\'' +
                '}';
    }
}