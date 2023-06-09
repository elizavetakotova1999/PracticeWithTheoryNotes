package СontrolFlowStatements;

public class ContinueStatement {

/*
Ключове слово continue використовується в мові програмування Java для пропуску поточної
ітерації циклу та переходу до наступної ітерації.

Коли виконується оператор continue, виконання циклу переходить безпосередньо до наступної
ітерації, пропускаючи будь-який наступний код, що знаходиться після continue у межах поточної ітерації циклу.

Зазвичай continue використовується для певних умов, коли потрібно пропустити певний код у циклі,
але продовжити його виконання з наступною ітерацією. Наприклад, це може бути корисним, коли потрібно
пропустити певні значення чи обробити тільки певні елементи масиву, а інші пропустити.
Ключове слово continue застосовується тільки в межах циклу (наприклад, for, while, do-while) і не може
бути використане поза ним.
*/
    public static void main(String[] args) {

            for (int i = 1; i <= 10; i++) {
                /*continue дозволяє перейти до наступної ітерації циклу, пропустивши
                    певний код після нього, у даному випадку, пропускаючи парні числа.*/
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println(i);
            }

        String[] fruits = {"Яблуко", "Банан", "Апельсин", "Груша", "Ківі"};

        for (String fruit : fruits) {
            // Пропустити фрукт, якщо його назва починається з літери "А" або "Г"
            if (fruit.startsWith("А") || fruit.startsWith("Г")) {
                continue;
            }

            System.out.println(fruit);
        }

        }

}
