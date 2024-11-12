/* Realizar un programa en Java, que construya un árbol binario cada nodo debe 
tener edad nombre y sexo. Cuando los datos ingresan las edad menores de edad 
quedan a la derecha los mayores a la izquierda. El ejercicio vale 0.5. Y el de 
clase pasada 0.5. Plazo de entrega de los dos 9 am. Se abren el espacio en la u 
virtual. */
package co.edu.ufpso.binarytree2;

public class BinaryTree2 {

    int age;
    boolean isMale;
    String name;

    public BinaryTree2(int age, boolean isMale, String name) {
        this.age = age;
        this.isMale = isMale;
        this.name = name;
    }

    BinaryTree2 left;
    BinaryTree2 right;

    public void addToLeft(BinaryTree2 node) {
        if (this.left == null) {
            this.left = node;
            return;
        }

        this.left.addToLeft(node);
    }

    public void addToRight(BinaryTree2 node) {
        if (this.right == null) {
            this.right = node;
            return;
        }

        this.right.addToRight(node);
    }

    public String debug(String indent) {
        String ret = "";

        String sex = "Male";
        if (!this.isMale) {
            sex = "Female";
        }

        ret += String.format("%sNode: %s [%s] %d years old.\n", indent, this.name, sex, this.age);
        if (this.left != null) {
            ret += indent + "Left:\n";
            ret += this.left.debug(indent + "    ");
        } else {
            ret += indent + "Left: Null.\n";
        }

        if (this.right != null) {
            ret += indent + "Right:\n";
            ret += this.right.debug(indent + "    ");
        } else {
            ret += indent + "Right: Null.\n";
        }

        return ret;
    }
}
