<h2><a href="https://leetcode.com/problems/decode-string/">394. Decode String</a></h2><h3>Medium</h3><hr><div data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723"><p data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723" data-immersive-translate-paragraph="1">Given an encoded string, return its decoded string.</p>

<p data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723" data-immersive-translate-paragraph="1">The encoding rule is: <code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">k[encoded_string]</code>, where the <code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">encoded_string</code> inside the square brackets is being repeated exactly <code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">k</code> times. Note that <code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">k</code> is guaranteed to be a positive integer.</p>

<p data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723" data-immersive-translate-paragraph="1">You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, <code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">k</code>. For example, there will not be input like <code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">3a</code> or <code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">2[4]</code>.</p>

<p data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723" data-immersive-translate-paragraph="1">The test cases are generated so that the length of the output will never exceed <code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">10<sup>5</sup></code>.</p>

<p data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">&nbsp;</p>
<p data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723"><strong class="example" data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "3[a]2[bc]"
<strong>Output:</strong> "aaabcbc"
</pre>

<p data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723"><strong class="example" data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "3[a2[c]]"
<strong>Output:</strong> "accaccacc"
</pre>

<p data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723"><strong class="example" data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> s = "2[abc]3[cd]ef"
<strong>Output:</strong> "abcabccdcdcdef"
</pre>

<p data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">&nbsp;</p>
<p data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723"><strong data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">
	<li data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723"><code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">1 &lt;= s.length &lt;= 30</code></li>
	<li data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">s</code> consists of lowercase English letters, digits, and square brackets <code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">'[]'</code>.</li>
	<li data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">s</code> is guaranteed to be <strong data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">a valid</strong> input.</li>
	<li data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723" data-immersive-translate-paragraph="1">All the integers in <code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">s</code> are in the range <code data-immersive-translate-walked="7aac9a21-c4af-4b61-9390-a0b3f5c98723">[1, 300]</code>.</li>
</ul>
</div>