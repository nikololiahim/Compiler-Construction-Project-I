package simple;

public class TypeDeclaration implements IDeclaration{
    public Identifier id;
    public IType type;
    public TypeDeclaration(Identifier id, IType type){
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nType Declaration {" +
                "Type name=" + id + '\'' +
                "type=" + type + '\'' +
                '}';
    }
}
