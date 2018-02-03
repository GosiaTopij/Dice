
package maindice;

/**
 *
 * @author gosia
 */
public abstract class Player {
        private String name = "Ziutek";

    public String getName() {
        return this.name;
    }

    public final void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = name;
        else
            throw new IllegalArgumentException("Invalid name!");
    }

    public abstract int guess();
    
}
