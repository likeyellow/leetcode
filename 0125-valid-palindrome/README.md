<h2><a href="https://leetcode.com/problems/valid-palindrome/">125. Valid Palindrome</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47"><p data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47" data-immersive-translate-paragraph="1">A phrase is a <strong data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47">palindrome</strong> if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.</p>

<p data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47" data-immersive-translate-paragraph="1">Given a string <code data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47">s</code>, return <code data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47">true</code><em data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47"> if it is a <strong data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47">palindrome</strong>, or </em><code data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47">false</code><em data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47"> otherwise</em>.</p>

<p data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47">&nbsp;</p>
<p data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47"><strong class="example" data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "A man, a plan, a canal: Panama"
<strong>Output:</strong> true
<strong>Explanation:</strong> "amanaplanacanalpanama" is a palindrome.
</pre>

<p data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47"><strong class="example" data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "race a car"
<strong>Output:</strong> false
<strong>Explanation:</strong> "raceacar" is not a palindrome.
</pre>

<p data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47"><strong class="example" data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> s = " "
<strong>Output:</strong> true
<strong>Explanation:</strong> s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
</pre>

<p data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47">&nbsp;</p>
<p data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47"><strong data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47">
	<li data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47"><code data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47">1 &lt;= s.length &lt;= 2 * 10<sup>5</sup></code></li>
	<li data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="c100c9b0-faf8-483f-b688-83cc6e9ecd47">s</code> consists only of printable ASCII characters.</li>
</ul>
</div>