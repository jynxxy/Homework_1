# Homework_1

Gra w zgadywanie polegająca na tym, że program losuje liczbę, a użytkownik próbuje ją odgadnąć.
 
Wymagania:
1. Program losuje liczbę z zakresu 0-99.
 
2. Program wyświetla komunikat z prośbą o rozpoczęcie zgadywania liczby całkowitej z zakresu 0-99
 
3. Program wczytuje liczbę wpisaną przez użytkownika.
 
4. Użytkownik powinien mieć maksymalnie 5 prób zgadywania.
 
5. Zachowanie programu podczas podania niepoprawnej liczby:
- w przypadku podania zbyt dużej liczby wypisać do konsoli: "Your number is GREATER than the one you are trying to guess"
- w przypadku podania zbyt małej liczby wypisać do konsoli: "Your number is LOWER than the one you are trying to guess"
- podać ile prób zostało mu do końca.
- jeżeli nie była to jego ostatnia próba to wypisać tekst: "Please try again"
 
6. Jeżeli użytkownik zgadł liczbę, program powinien wydrukować tekst "You guessed it!"
 
7. Jeżeli w ciągu 5 prób nie udało się odgadnąć liczby użytkownik, program ma wydrukować wiadomość:
"Sorry you didn't guess the number, the answer was: "
oraz dopisać do niej jaka była wartość liczby której nie udało się odgadnąć

Podpowiedź:
Aby zakończyć wykonywanie pętli wcześniej niż wskazuje na to jej warunek można się posłużyć poleceniem 'break;'
 

Zadanie 2
int size = 5;
int[] numbers = new int[size];
 
Powyższy kod pozwala na stworzenie tablicy gdzie ilość elementów jest zależna o wartości zmiennej. Wykorzystaj to w poniższym programie:
 
1. Program powinien poprosić użytkownika o podanie liczby całkowitej.
2. Następnie program powinien stworzyć tablicę po podanym przez użytkownika rozmiarze. 
3. Następnie poprosić użytkownika o podanie liczb aby zapełnić nimi tablicę (jeżeli użytkownik w pkt 1 podał liczbę 5 jako rozmiar, to w pkt 3 oczekujemy że poda 5 liczb i każda z nich zapiszemy w tablicy)
4. Po zakończeniu wpisywania liczb przez użytkownika, program powinien wypisać jaka była średnia liczb wprowadzonych przez użytkownika oraz wartość maksymalna
