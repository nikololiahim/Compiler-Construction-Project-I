package simple;


import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.math.BigInteger;

import static org.objectweb.asm.Opcodes.BIPUSH;

public class IntegerLiteral implements IExpression {
    public final BigInteger v;

    public IntegerLiteral(BigInteger v){
        this.v = v;
    }

    @Override
    public String toString() {
        return "IntegerLiteral{" +
                "int_value=" + v +
                '}';
    }

    @Override
    public void emit(ClassWriter cw, MethodVisitor mv) {
        mv.visitLdcInsn(v.intValue());
    }

    @Override
    public Object resolve() {
        return v.intValue();
    }
}
