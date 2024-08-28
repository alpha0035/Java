package abstract_classes_interfaces;
// an interface must be declared in a file with the same name
// interfaces'name should be adjective
public interface interfaces {
    // field in an interfaces is automatically public, static and final
    int MAX=100;
    int MIN= 0;
    // all the methods in an interface are assumed to be public and abstract
    void play();
    int getScore(String name);
}
