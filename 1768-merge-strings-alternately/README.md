<h2><a href="https://leetcode.com/problems/merge-strings-alternately/">1768. Merge Strings Alternately</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75"><p data-immersive-translate-paragraph="1" data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75">You are given two strings <code data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75">word1</code> and <code data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75">word2</code>. Merge the strings by adding letters in alternating order, starting with <code data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75">word1</code>. If a string is longer than the other, append the additional letters onto the end of the merged string.</p>

<p data-immersive-translate-paragraph="1" data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75">Return <em data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75">the merged string.</em></p>

<p data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75">&nbsp;</p>
<p data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75"><strong class="example" data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> word1 = "abc", word2 = "pqr"
<strong>Output:</strong> "apbqcr"
<strong>Explanation:</strong>&nbsp;The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
</pre>

<p data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75"><strong class="example" data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> word1 = "ab", word2 = "pqrs"
<strong>Output:</strong> "apbqrs"
<strong>Explanation:</strong>&nbsp;Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
</pre>

<p data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75"><strong class="example" data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> word1 = "abcd", word2 = "pq"
<strong>Output:</strong> "apbqcd"
<strong>Explanation:</strong>&nbsp;Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
</pre>

<p data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75">&nbsp;</p>
<p data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75"><strong data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75">
	<li data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75"><code data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75">1 &lt;= word1.length, word2.length &lt;= 100</code></li>
	<li data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75">word1</code> and <code data-immersive-translate-walked="b7e39449-ee76-4697-89a0-ad742c3b0f75">word2</code> consist of lowercase English letters.</li>
</ul></div>