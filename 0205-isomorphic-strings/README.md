<h2><a href="https://leetcode.com/problems/isomorphic-strings/">205. Isomorphic Strings</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5"><p data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5" data-immersive-translate-paragraph="1">Given two strings <code data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">s</code> and <code data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">t</code>, <em data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">determine if they are isomorphic</em>.</p>

<p data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5" data-immersive-translate-paragraph="1">Two strings <code data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">s</code> and <code data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">t</code> are isomorphic if the characters in <code data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">s</code> can be replaced to get <code data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">t</code>.</p>

<p data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5" data-immersive-translate-paragraph="1">All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.</p>

<p data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">&nbsp;</p>
<p data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5"><strong class="example" data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5" data-immersive-translate-paragraph="1">Example 1:</strong></p>
<pre><strong>Input:</strong> s = "egg", t = "add"
<strong>Output:</strong> true
</pre><p data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5"><strong class="example" data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5" data-immersive-translate-paragraph="1">Example 2:</strong></p>
<pre><strong>Input:</strong> s = "foo", t = "bar"
<strong>Output:</strong> false
</pre><p data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5"><strong class="example" data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5" data-immersive-translate-paragraph="1">Example 3:</strong></p>
<pre><strong>Input:</strong> s = "paper", t = "title"
<strong>Output:</strong> true
</pre>
<p data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">&nbsp;</p>
<p data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5"><strong data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">
	<li data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5"><code data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">1 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5"><code data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">t.length == s.length</code></li>
	<li data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">s</code> and <code data-immersive-translate-walked="ceb055d5-f7f9-4cfc-b284-0eda4c8808c5">t</code> consist of any valid ascii character.</li>
</ul>
</div>