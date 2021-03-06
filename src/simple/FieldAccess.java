package simple;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

public class FieldAccess implements IPrimary{
    Identifier id;

    public FieldAccess(Identifier id){
        this.id = id;
    }
    @Override
    public String toString() {
        return "\nField_Access{" +
                "id=" + id + '\'' +
                '}';
    }

    @Override
    public void emit(ClassWriter cw, MethodVisitor mv, String methodName, int maxDepth) {

    }

    @Override
    public String resolve_type(String methodName) {
        return "I";
    }
}
