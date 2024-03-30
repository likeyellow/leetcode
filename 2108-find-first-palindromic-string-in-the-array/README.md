<h2><a href="https://leetcode.com/problems/find-first-palindromic-string-in-the-array/">2108. Find First Palindromic String in the Array</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a"><p data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a" data-immersive-translate-paragraph="1">Given an array of strings <code data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a">words</code>, return <em data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a">the first <strong data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a">palindromic</strong> string in the array</em>. If there is no such string, return <em data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a">an <strong data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a">empty string</strong> </em><code data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a">""</code>.</p>

<p data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a" data-immersive-translate-paragraph="1">A string is <strong data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a">palindromic</strong> if it reads the same forward and backward.</p>

<p data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a">&nbsp;</p>
<p data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a"><strong class="example" data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> words = ["abc","car","ada","racecar","cool"]
<strong>Output:</strong> "ada"
<strong>Explanation:</strong> The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.
</pre>

<p data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a"><strong class="example" data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> words = ["notapalindrome","racecar"]
<strong>Output:</strong> "racecar"
<strong>Explanation:</strong> The first and only string that is palindromic is "racecar".
</pre>

<p data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a"><strong class="example" data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> words = ["def","ghi"]
<strong>Output:</strong> ""
<strong>Explanation:</strong> There are no palindromic strings, so the empty string is returned.
</pre>

<p data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a">&nbsp;</p>
<p data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a"><strong data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a">
	<li data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a"><code data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a">1 &lt;= words.length &lt;= 100</code></li>
	<li data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a"><code data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a">1 &lt;= words[i].length &lt;= 100</code></li>
	<li data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="243c2473-bf63-489c-8bc7-44dd2034847a">words[i]</code> consists only of lowercase English letters.</li>
</ul>
</div>