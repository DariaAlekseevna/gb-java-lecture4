package Lesson_04;

import java.util.Stack;

public class Ex005 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -
        //var exp = "20 30 - 10 *".split(" "); // (20-30)*10

        // есть выражение в постфиксной форме, разбираем сплитом по пробелу
        // var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3 
        // другое выражение
        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3

        int res = 0; // переменная для хранения результата выражения
        System.out.println(exp);
        
        Stack<Integer> st = new Stack<>(); // нужен стек, где будем хранить числа
        // пробегаемся по всем элементам выражения проверям, является ли текущий эл-т числом, если да добавляем в стек
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
            // если получем операцию, то нужно извлечь два элемента из стека, применить операцию и положить обратно в стек
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        // по результату извлекаем последний элемент из стека и получаем значение выражения
        System.out.printf("%d\n", st.pop());
    }
}