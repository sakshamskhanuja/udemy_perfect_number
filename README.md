## Perfect Number

### Description

A perfect number is a positive integer which is equal to the sum of its proper positive divisors. Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.

For example, take the number 6: 
Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6. Therefore, 6 is a perfect number (as well as the first perfect number).

Write a method named <b>isPerfectNumber</b> with one parameter of type <b>int</b> named <b>number</b>. If number is < 1, the method should return <b>false</b>. The method must calculate if the number is perfect. If the number is perfect, the method should return <b>true</b>; otherwise, it should return <b>false</b>.

### Examples of input/output

<ul>
<li>isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6</li>
<li>isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28</li>
<li>isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5</li>
<li>isPerfectNumber(-1); should return false since the number is < 1</li>
</ul>
