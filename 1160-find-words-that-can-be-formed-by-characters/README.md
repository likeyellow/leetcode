<h2><a href="https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/">1160. Find Words That Can Be Formed by Characters</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c"><p data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c" data-immersive-translate-paragraph="1">You are given an array of strings <code data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c">words</code> and a string <code data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c">chars</code>.</p>

<p data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c" data-immersive-translate-paragraph="1">A string is <strong data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c">good</strong> if it can be formed by characters from <code data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c">chars</code> (each character can only be used once).</p>

<p data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c" data-immersive-translate-paragraph="1">Return <em data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c">the sum of lengths of all good strings in words</em>.</p>

<p data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c">&nbsp;</p>
<p data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c"><strong class="example" data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> words = ["cat","bt","hat","tree"], chars = "atach"
<strong>Output:</strong> 6
<strong>Explanation:</strong> The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
</pre>

<p data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c"><strong class="example" data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> words = ["hello","world","leetcode"], chars = "welldonehoneyr"
<strong>Output:</strong> 10
<strong>Explanation:</strong> The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
</pre>

<p data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c">&nbsp;</p>
<p data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c"><strong data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c">
	<li data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c"><code data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c">1 &lt;= words.length &lt;= 1000</code></li>
	<li data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c"><code data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c">1 &lt;= words[i].length, chars.length &lt;= 100</code></li>
	<li data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c">words[i]</code> and <code data-immersive-translate-walked="f6f12f27-e5c7-4c04-9fcb-eb10e9f0491c">chars</code> consist of lowercase English letters.</li>
</ul>
</div>