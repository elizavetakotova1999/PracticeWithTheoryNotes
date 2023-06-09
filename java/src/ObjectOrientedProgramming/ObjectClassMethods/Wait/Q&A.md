
## Що робить метод `wait()`?
Метод `wait()` виконує потік у режимі очікування, зупиняючи його виконання до отримання сповіщення від іншого потоку.

## Де можна використовувати метод `wait()`?
Метод `wait()` можна використовувати у ситуаціях, коли потік очікує на певний стан або подію, які відбуваються
в іншому потоці.

## Як потік виходить з режиму очікування методу `wait()`?
Потік виходить з режиму очікування методу `wait()` в таких випадках: (1) коли інший потік викликає метод `notify()`
або `notifyAll()` на об'єкті, на якому викликано `wait()`, (2) коли потік був перерваний за допомогою методу
`interrupt()` або (3) коли встановлено час очікування за допомогою перевантаженого варіанту методу `wait()` з аргументом.

## Чому слід використовувати метод `wait()` разом з методами `notify()` або `notifyAll()`?
Використання методу `wait()` спільно з методами `notify()` або `notifyAll()` дозволяє потокам ефективно обмінюватися 
сигналами та звільняти/повідомляти один або декілька очікуючих потоків про зміни в стані ресурсу або подій.

## Питання 5: Які практичні переваги використання методу `wait()` у порівнянні з іншими способами синхронізації потоків?
Використання методу `wait()` дозволяє ефективно управляти ресурсами потоків, такими як процесорний час, тому що потоки,
які перебувають у режимі очікування, не витрачають ресурси процесора до отримання сповіщення. Крім того, 
використання `wait()` у поєднанні з `notify()` або `notifyAll()` допомагає уникнути "голодування" (starvation) потоків 
і забезпечує справедливе чергування (fair scheduling) між потоками.

Важливо розуміти, що використання цього методу потребує обережного планування і правильного використання моніторів 
та синхронізації для уникнення потенційних проблем, таких як витік ресурсів або блокування програми.