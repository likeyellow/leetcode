<h2><a href="https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/">1662. Check If Two String Arrays are Equivalent</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7"><p data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7" data-immersive-translate-paragraph="1">Given two string arrays <code data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">word1</code> and <code data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">word2</code>, return<em> </em><code data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">true</code><em data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7"> if the two arrays <strong data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">represent</strong> the same string, and </em><code data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">false</code><em data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7"> otherwise.</em></p>

<p data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7" data-immersive-translate-paragraph="1">A string is <strong data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">represented</strong> by an array if the array elements concatenated <strong data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">in order</strong> forms the string.</p>

<p data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">&nbsp;</p>
<p data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7"><strong class="example" data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> word1 = ["ab", "c"], word2 = ["a", "bc"]
<strong>Output:</strong> true
<strong>Explanation:</strong>
word1 represents string "ab" + "c" -&gt; "abc"
word2 represents string "a" + "bc" -&gt; "abc"
The strings are the same, so return true.</pre>

<p data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7"><strong class="example" data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> word1 = ["a", "cb"], word2 = ["ab", "c"]
<strong>Output:</strong> false
</pre>

<p data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7"><strong class="example" data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
<strong>Output:</strong> true
</pre>

<p data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">&nbsp;</p>
<p data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7"><strong data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">
	<li data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7"><code data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">1 &lt;= word1.length, word2.length &lt;= 10<sup>3</sup></code></li>
	<li data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7"><code data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">1 &lt;= word1[i].length, word2[i].length &lt;= 10<sup>3</sup></code></li>
	<li data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7"><code data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">1 &lt;= sum(word1[i].length), sum(word2[i].length) &lt;= 10<sup>3</sup></code></li>
	<li data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">word1[i]</code> and <code data-immersive-translate-walked="a6d336e9-9301-4840-b7c7-6c93402498e7">word2[i]</code> consist of lowercase letters.</li>
</ul>
</div>