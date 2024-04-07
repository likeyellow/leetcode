<h2><a href="https://leetcode.com/problems/range-sum-of-bst/">938. Range Sum of BST</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c"><p data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c" data-immersive-translate-paragraph="1">Given the <code data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">root</code> node of a binary search tree and two integers <code data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">low</code> and <code data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">high</code>, return <em data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">the sum of values of all nodes with a value in the <strong data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">inclusive</strong> range </em><code data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">[low, high]</code>.</p>

<p data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">&nbsp;</p>
<p data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c"><strong class="example" data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c" data-immersive-translate-paragraph="1">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/05/bst1.jpg" style="width: 400px; height: 222px;" data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">
<pre><strong>Input:</strong> root = [10,5,15,3,7,null,18], low = 7, high = 15
<strong>Output:</strong> 32
<strong>Explanation:</strong> Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
</pre>

<p data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c"><strong class="example" data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c" data-immersive-translate-paragraph="1">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/05/bst2.jpg" style="width: 400px; height: 335px;" data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">
<pre><strong>Input:</strong> root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
<strong>Output:</strong> 23
<strong>Explanation:</strong> Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
</pre>

<p data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">&nbsp;</p>
<p data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c"><strong data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">
	<li data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c" data-immersive-translate-paragraph="1">The number of nodes in the tree is in the range <code data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">[1, 2 * 10<sup>4</sup>]</code>.</li>
	<li data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c"><code data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">1 &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
	<li data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c"><code data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">1 &lt;= low &lt;= high &lt;= 10<sup>5</sup></code></li>
	<li data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c" data-immersive-translate-paragraph="1">All <code data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">Node.val</code> are <strong data-immersive-translate-walked="f6a2a494-a6f6-4c29-91a0-652c3fb8505c">unique</strong>.</li>
</ul>
</div>