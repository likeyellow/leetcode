<h2><a href="https://leetcode.com/problems/happy-number/">202. Happy Number</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956"><p data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956" data-immersive-translate-paragraph="1">Write an algorithm to determine if a number <code data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">n</code> is happy.</p>

<p data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956" data-immersive-translate-paragraph="1">A <strong data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">happy number</strong> is a number defined by the following process:</p>

<ul data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">
	<li data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956" data-immersive-translate-paragraph="1">Starting with any positive integer, replace the number by the sum of the squares of its digits.</li>
	<li data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956" data-immersive-translate-paragraph="1">Repeat the process until the number equals 1 (where it will stay), or it <strong data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">loops endlessly in a cycle</strong> which does not include 1.</li>
	<li data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956" data-immersive-translate-paragraph="1">Those numbers for which this process <strong data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">ends in 1</strong> are happy.</li>
</ul>

<p data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956" data-immersive-translate-paragraph="1">Return <code data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">true</code> <em data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">if</em> <code data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">n</code> <em data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">is a happy number, and</em> <code data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">false</code> <em data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">if not</em>.</p>

<p data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">&nbsp;</p>
<p data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956"><strong class="example" data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> n = 19
<strong>Output:</strong> true
<strong>Explanation:</strong>
1<sup>2</sup> + 9<sup>2</sup> = 82
8<sup>2</sup> + 2<sup>2</sup> = 68
6<sup>2</sup> + 8<sup>2</sup> = 100
1<sup>2</sup> + 0<sup>2</sup> + 0<sup>2</sup> = 1
</pre>

<p data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956"><strong class="example" data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> n = 2
<strong>Output:</strong> false
</pre>

<p data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">&nbsp;</p>
<p data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956"><strong data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">
	<li data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956"><code data-immersive-translate-walked="356a51d8-b176-4ea6-a640-08d9a595a956">1 &lt;= n &lt;= 2<sup>31</sup> - 1</code></li>
</ul>
</div>