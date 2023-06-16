
## Що таке поліморфізм в ООП?

Поліморфізм в ООП означає здатність об'єктів різних класів виконувати однакові методи з різною реалізацією.
Це означає, що ми можемо викликати методи на об'єктах, не звертаючи уваги на їх тип, але отримувати різні результати в
залежності від фактичного типу об'єкта. Поліморфізм дозволя є використовувати поліморфні посилання, які можуть посилатися
на об'єкти різних класів у єдиному інтерфейсі або батьківському класі.

## Яким чином поліморфізм реалізований в Java?

В Java поліморфізм реалізований за допомогою виклику методів на об'єктах заснованих на їх типі. Існує два
типи поліморфізму в Java: поліморфізм підтипів і поліморфізм параметрів.

1. Поліморфізм підтипів: Дозволяє об'єктам підкласів бути використаними в місцях, де вимагаються об'єкти батьківського 
класу. Наприклад, якщо є клас `Animal` і підкласи `Cat` і `Dog`, то об'єкти цих підкласів можуть бути присвоєні змінним 
типу `Animal` і викликати методи, визначені в `Animal`.

2. Поліморфізм параметрів: Дозволяє методам приймати аргументи різних типів, які наслідують від одного батьківського
класу або реалізують один інтерфейс. Наприклад, якщо є метод, що очікує аргумент типу `Animal`, то можна передати аргумент 
типу `Cat` або `Dog`, оскільки вони успадковують від `Animal`.

## Що таке перевизначення (overriding) методів?

Перевизначення (overriding) методів в ООП означає створення нової реалізації методу в підкласі, яка заміняє
реалізацію методу в батьківському класі. При перевизначенні методу в підкласі, метод з батьківського класу з тим самим 
ім'ям і параметрами замінюється новою реалізацією в підкласі. При виклику методу на об'єкті підкласу, буде виконана
реалізація методу в підкласі, а не в батьківському класі.

Перевизначений метод повинен мати той самий підпис (ім'я, типи параметрів і повернене значення), що і метод в 
батьківському класі, або його підтип. Використання перевизначення дозволяє підкласам змінювати або доповнювати поведінку
методів, успадкованих від батьківського класу.