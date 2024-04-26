package lists;
import lists.MyArrayList;
import lists.MyList;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
            MyArrayList myArrayList = new MyArrayList() {
                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public void set(Object item) {

                }
                @Override
                public int index0f(Object object) {
                    return 0;
                }

                @Override
                public int lastIndex0f(Object object) {
                    return 0;
                }
            };
            myArrayList.add(11.5);
            myArrayList.add(10);
            myArrayList.add(9);
            myArrayList.add(8.7);
            myArrayList.add(7);
            myArrayList.add(6);
            myArrayList.remove(0);
            System.out.println(myArrayList);
            System.out.println(myArrayList.get(3));

        }
    }

