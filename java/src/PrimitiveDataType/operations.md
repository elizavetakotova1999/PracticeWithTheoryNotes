# Операції з примітивними типами даних в Java

1. **Арифметичні операції:**
    - Додавання (`+`): додає два операнди разом.
    - Віднімання (`-`): віднімає один операнд від іншого.
    - Множення (`*`): множить два операнди.
    - Ділення (`/`): ділить один операнд на інший.
    - Залишок від ділення (`%`): повертає залишок від ділення двох операндів.

2. **Операції порівняння:**
    - Менше (`<`): перевіряє, чи є перший операнд меншим за другий.
    - Більше (`>`): перевіряє, чи є перший операнд більшим за другий.
    - Менше або рівне (`<=`): перевіряє, чи є перший операнд меншим або рівним другому.
    - Більше або рівне (`>=`): перевіряє, чи є перший операнд більшим або рівним другому.
    - Рівне (`==`): перевіряє, чи є два операнди рівними.
    - Не рівне (`!=`): перевіряє, чи є два операнди нерівними.

3. **Операції присвоювання:**
    - Присвоєння (`=`): присвоює значення правого операнда лівому операнду.
    - Присвоєння з арифметичною операцією (`+=`, `-=`, `*=`, `/=`, `%=`): виконує арифметичну операцію з правим операндом і присвоює результат лівому операнду.

4. **Логічні операції:**
    - Логічне "І" (`&&`): повертає `true`, якщо обидва операнди є `true`, в іншому випадку - `false`.
    - Логічне "АБО" (`||`): повертає `true`, якщо хоча б один з операндів є `true`, в іншому випадку - `false`.
    - Логічне "НЕ" (`!`): змінює значення операнду на протилежне: `true` стає `false`, а `false` стає `true`.

5. **Інкремент та декремент:**
    - Інкремент (`++`): збільшує значення операнда на 1.
    - Декремент (`--`): зменшує значення операнда на 1.

6. **Операції побітового зсуву:**
    - Зсув вліво (`<<`): зсуває біти операнда вліво на вказану кількість позицій.
    - Зсув вправо зі знаком (`>>`): зсуває біти операнда вправо на вказану кількість позицій з використанням знака.
    - Беззнаковий зсув вправо (`>>>`): зсуває біти операнда вправо на вказану кількість позицій без урахування знака.

7. **Операції бітової логіки:**
    - Бітове "І" (`&`): виконує побітове "І" для відповідних бітів операндів.
    - Бітове "АБО" (`|`): виконує побітове "АБО" для відповідних бітів операндів.
    - Бітове "Виключаюче АБО" (`^`): виконує побітове "Виключаюче АБО" для відповідних бітів операндів.
    - Бітове заперечення (`~`): змінює кожен біт операнда на протилежний.

8. **Операції рядкового з'єднання:**
    - Конкатенація рядків (`+`): об'єднує два рядки в один, приєднуючи другий рядок до кінця першого.

9. **Приведення типів:**
    - Явне перетворення типів: дозволяє явно перетворити значення одного примітивного типу на інший примітивний тип.
      Наприклад, `(int) doubleValue` перетворює значення типу `double` на тип `int`.

10. **Умовний оператор:**
    - Тернарний оператор (`?:`): виконує умовну операцію на підставі заданої умови. Складається з умови, значення,
      яке повертається, якщо умова є істинною, та значення, яке повертається, якщо умова є хибною.
