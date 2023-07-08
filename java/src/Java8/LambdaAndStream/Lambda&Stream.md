
# `Stream` і `Lambda` в Java працюють разом для забезпечення потужних можливостей обробки даних.

**Основні кроки в роботі з `Stream` та `Lambda`-виразами:**

1. Створення потоку: Спочатку створюється початковий потік, зазвичай з колекції або іншого джерела даних. Наприклад, `List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); Stream<Integer> stream = numbers.stream();`

2. Виконання проміжних операцій: За допомогою проміжних операцій, таких як `filter`, `map`, `sorted` та інші, оброблюються елементи потоку. Ці операції можуть використовувати лямбда-вирази для визначення умов, трансформацій або сортування. Наприклад, `Stream<Integer> evenStream = stream.filter(number -> number % 2 == 0);`

3. Застосування кінцевих операцій: Після виконання проміжних операцій, застосовуються кінцеві операції, такі як `collect`, `forEach`, `reduce`, `count` та інші, щоб отримати результат або виконати певну дію. Ці операції можуть також використовувати лямбда-вирази для визначення дій або обчислень. Наприклад, `List<Integer> evenNumbers = evenStream.collect(Collectors.toList());`

**Основна ідея полягає в тому, що лямбда-вирази використовуються для визначення функцій або дій, які застосовуються до елементів потоку. Це дозволяє здійснювати гнучкі трансформації та операції над потоком даних, забезпечуючи чистий та експресивний код.**

**Наприклад, у прикладі вище, лямбда-вираз `number -> number % 2 == 0` використовується для визначення умови фільтрації парних чисел у потоці. Аналогічно, лямбда-вирази можуть бути використані для визначення функцій мапування, згортання, сортування та багатьох інших операцій з `Stream`.**

**Таке поєднання `Stream` та лямбда-виразів дозволяє забезпечити зручну та потужну обробку даних в Java з меншим обсягом коду та більшою експресивністю.**