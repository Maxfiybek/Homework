package Login_.DB;

import java.util.Arrays;
import java.util.Objects;

public class MyList<T> {

    private int inicialCapacity;
    private Object[] objects;
    private int size = 0;

    public MyList() {
        this.inicialCapacity = 10;
        objects = new Object[inicialCapacity];
    }

    public MyList(int inicialCapacity) {
        this.inicialCapacity = inicialCapacity;
    }

    public void add(T c) {
        inicialCapacity();
        Object[] obj = new Object[inicialCapacity];
        int i = 0;
        for (int j = 0; j < size(); j++) {
            obj[i] = objects[j];
            i++;
        }
        obj[i] = c;
        objects = obj;
        size();
    }

    public void remove(T object) {
        int a = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == object) {
                a = i;
                break;
            }
        }
        for (int i = a; i < objects.length - 1; i++) {
            objects[i] = objects[i + 1];
        }
        size();
        System.out.println("Successfully removed: [" + object + "]");
    }


    public int search(T element) {
        for (int i = 0; i < objects.length - 1; i++) {
            if (objects[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T element) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void edit(int index, T object) {
        objects[index] = object;
    }


    private void inicialCapacity() {
        if (inicialCapacity - size <= 0) {
            inicialCapacity = (inicialCapacity * 3) / 2 + 1;
        }
    }

    private int size() {
        int count = 0;
        for (Object object : objects) {
            if (object == null) {
                continue;
            }
            count++;
        }
        size = count;
        return size;
    }

    public Object getElement(int index) {
        return objects[index];
    }


    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(objects, size));
    }


    public void getLength() {
        System.out.println(objects.length);
    }

    public String getObjects() {
        return Arrays.toString(Arrays.copyOf(objects, size));
    }

    public int length() {
        return objects.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyList<?> myList)) return false;
        return inicialCapacity == myList.inicialCapacity && size == myList.size && Arrays.equals(objects, myList.objects);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(inicialCapacity, size);
        result = 31 * result + Arrays.hashCode(objects);
        return result;
    }
}
