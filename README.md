<h1 align="center"> Проект автоматизации тестов для Dats Team <img src="https://github.com/Toalra/HomeWork15/blob/master/media/logs/logo.svg" wight="35" height="35"/></h1>
<h3>Содержание</h3>
<h3>Использованные инструменты</h3>
<a href=""><img  src="https://github.com/Toalra/HomeWork15/blob/master/media/logs/AllureTestOps.svg" wight="40" height="40"/></a>
<a href=""><img src="https://github.com/Toalra/HomeWork15/blob/master/media/logs/Allure_Report.svg" wight="40" height="40"/></a>
<a href=""><img src="https://github.com/Toalra/HomeWork15/blob/master/media/logs/GitHub.svg" wight="40" height="40"/></a>
<a href=""><img src="https://github.com/Toalra/HomeWork15/blob/master/media/logs/Gradle.svg" wight="40" height="40"/></a>
<a href=""><img src="https://github.com/Toalra/HomeWork15/blob/master/media/logs/Intelij_IDEA.svg" wight="40" height="40"/></a>
<a href=""><img src="https://github.com/Toalra/HomeWork15/blob/master/media/logs/JUnit5.svg" wight="40" height="40"/></a>
<a href=""><img src="https://github.com/Toalra/HomeWork15/blob/master/media/logs/Java.svg" wight="40" height="40"/></a>
<a href=""><img src="https://github.com/Toalra/HomeWork15/blob/master/media/logs/Jenkins.svg" wight="40" height="40"/></a>
<a href=""><img src="https://github.com/Toalra/HomeWork15/blob/master/media/logs/Selenide.svg" wight="40" height="40"/></a>
<a href=""><img src="https://github.com/Toalra/HomeWork15/blob/master/media/logs/Selenoid.svg" wight="40" height="40"/></a>
<a href=""><img src="https://github.com/Toalra/HomeWork15/blob/master/media/logs/Telegram.svg" wight="40" height="40"/></a>

* Проект автотестов для компаниия Dats Team написан на языке `Java` с применением фреймворка для автотестирования `Selenide` и `JUnit 5`.
* Для автоматической сборки автотестов был использован `Gradle`.
* Во время прогона автотестов применялся сервер `Selenoid`.
* Для реадизации удаленного запуска применялся `Jenkins` с формированием отчета в `Allure`.
* Краткие отчеты с результатами тестирования отправлятся в `Telegram` с использованием бота.
* Применена интеграция с `Allure TestOps` и `Jira`

В отчет `Allure` входит:
* Описанные шаги тестов;
* Скриншот страницы результата на последнем шаге;
* Page Source;
* Логи консоли браузера;
* Видео с выполнением автотеста.

<h3>Реализованные проверки</h3>

* Проверка открытия верных страниц по разделам сайта
* Проверка заполнения формы "Расскажите о себе"
* Проверка открытия страницы `dats.games`

<h3>Запуск автотестов</h3>

---

<h4>Запуск автотестов из терминала</h4>
При выполнении команды в терминале IntelliJ IDEA, тесты запустятся в удаленном браузере в `Selenoid`

```
gradle clean first_test
```

<h4>Запуск тестов на удаленном барузере</h4>
Автотеты можно запустить также терминал на удаленном браузере

```
gradle clean test -Denv=main
```

Запуск автотестов при переопределенных параметров запуска
```
clean
main -DremoteUrl=${SELENOID_URL}
-DbaseUrl=${BASE_URL}
-DbrowserSize=${BROWSER_SIZE}
-Dbrowser=${BROWSER_NAME}
-Dbrowser_version="${BROWSER_VERSION}"
```

<h4>Параметры сборок</h4>

* `BROWSER_NAME` – браузер для выполнения автотестов. По-умолчанию - chrome.
* `BROWSER_VERSION` – версия браузера для выполнения автотестов. По-умолчанию - 100.0.
* `BROWSER_SIZE` – размер окна браузера. По-умолчанию - 1920x1080.
* `BASE_URL` – web-адрес тестируемого приложения.
* `REMOTE_BROWSER_URL`  – адрес удаленного сервера для запуска автотестов.

<h3>Сборка в Jenkins</h3>

---



<h4>Overwies</h4>
<h4>Результат выполнения теста</h4>
<h3>Интеграция с Allure TestOps</h3>

---

<h3>Интеграция с Jira</h3>

---

<h3>Краткий отчет в Telegram</h3>

---

<h3>Видео  примером запуска</h3>

---
