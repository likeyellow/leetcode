<h2><a href="https://leetcode.com/problems/backspace-string-compare/">844. Backspace String Compare</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f"><p data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f" data-immersive-translate-paragraph="1">Given two strings <code data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">s</code> and <code data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">t</code>, return <code data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">true</code> <em data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">if they are equal when both are typed into empty text editors</em>. <code data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">'#'</code> means a backspace character.</p>

<p data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f" data-immersive-translate-paragraph="1">Note that after backspacing an empty text, the text will continue empty.</p>

<p data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">&nbsp;</p>
<p data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f"><strong class="example" data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "ab#c", t = "ad#c"
<strong>Output:</strong> true
<strong>Explanation:</strong> Both s and t become "ac".
</pre>

<p data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f"><strong class="example" data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "ab##", t = "c#d#"
<strong>Output:</strong> true
<strong>Explanation:</strong> Both s and t become "".
</pre>

<p data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f"><strong class="example" data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> s = "a#c", t = "b"
<strong>Output:</strong> false
<strong>Explanation:</strong> s becomes "c" while t becomes "b".
</pre>

<p data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">&nbsp;</p>
<p data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f"><strong data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">
	<li data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f"><code data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f"><span>1 &lt;= s.length, t.length &lt;= 200</span></code></li>
	<li data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f"><span data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">s</code> and <code data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">t</code> only contain lowercase letters and <code data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">'#'</code> characters.</span></li>
</ul>

<p data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">&nbsp;</p>
<p data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f" data-immersive-translate-paragraph="1"><strong data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">Follow up:</strong> Can you solve it in <code data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">O(n)</code> time and <code data-immersive-translate-walked="b928dd73-47b5-4370-bfe5-8055dec8100f">O(1)</code> space?</p>
</div>