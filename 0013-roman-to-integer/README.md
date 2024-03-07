<h2><a href="https://leetcode.com/problems/roman-to-integer/">13. Roman to Integer</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11"><p data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11" data-immersive-translate-paragraph="1">Roman numerals are represented by seven different symbols:&nbsp;<code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">I</code>, <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">V</code>, <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">X</code>, <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">L</code>, <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">C</code>, <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">D</code> and <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">M</code>.</p>

<pre><strong>Symbol</strong>       <strong>Value</strong>
I             1
V             5
X             10
L             50
C             100
D             500
M             1000</pre>

<p data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11" data-immersive-translate-paragraph="1">For example,&nbsp;<code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">2</code> is written as <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">II</code>&nbsp;in Roman numeral, just two ones added together. <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">12</code> is written as&nbsp;<code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">XII</code>, which is simply <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">X + II</code>. The number <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">27</code> is written as <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">XXVII</code>, which is <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">XX + V + II</code>.</p>

<p data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11" data-immersive-translate-paragraph="1">Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">IIII</code>. Instead, the number four is written as <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">IV</code>. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">IX</code>. There are six instances where subtraction is used:</p>

<ul data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">
	<li data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">I</code> can be placed before <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">V</code> (5) and <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">X</code> (10) to make 4 and 9.&nbsp;</li>
	<li data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">X</code> can be placed before <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">L</code> (50) and <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">C</code> (100) to make 40 and 90.&nbsp;</li>
	<li data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">C</code> can be placed before <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">D</code> (500) and <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">M</code> (1000) to make 400 and 900.</li>
</ul>

<p data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11" data-immersive-translate-paragraph="1">Given a roman numeral, convert it to an integer.</p>

<p data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">&nbsp;</p>
<p data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11"><strong class="example" data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "III"
<strong>Output:</strong> 3
<strong>Explanation:</strong> III = 3.
</pre>

<p data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11"><strong class="example" data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "LVIII"
<strong>Output:</strong> 58
<strong>Explanation:</strong> L = 50, V= 5, III = 3.
</pre>

<p data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11"><strong class="example" data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> s = "MCMXCIV"
<strong>Output:</strong> 1994
<strong>Explanation:</strong> M = 1000, CM = 900, XC = 90 and IV = 4.
</pre>

<p data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">&nbsp;</p>
<p data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11"><strong data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">
	<li data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11"><code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">1 &lt;= s.length &lt;= 15</code></li>
	<li data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">s</code> contains only&nbsp;the characters <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">('I', 'V', 'X', 'L', 'C', 'D', 'M')</code>.</li>
	<li data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11" data-immersive-translate-paragraph="1">It is <strong data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">guaranteed</strong>&nbsp;that <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">s</code> is a valid roman numeral in the range <code data-immersive-translate-walked="bc04e0fa-12f7-4834-9b66-33ff3cd0ab11">[1, 3999]</code>.</li>
</ul>
</div>