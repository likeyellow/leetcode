<h2><a href="https://leetcode.com/problems/merge-two-sorted-lists/solution/">21. Merge Two Sorted Lists</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f"><p data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f" data-immersive-translate-paragraph="1">You are given the heads of two sorted linked lists <code data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f">list1</code> and <code data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f">list2</code>.</p>

<p data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f" data-immersive-translate-paragraph="1">Merge the two lists into one <strong data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f">sorted</strong> list. The list should be made by splicing together the nodes of the first two lists.</p>

<p data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f" data-immersive-translate-paragraph="1">Return <em data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f">the head of the merged linked list</em>.</p>

<p data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f">&nbsp;</p>
<p data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f"><strong class="example" data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f" data-immersive-translate-paragraph="1">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg" style="width: 662px; height: 302px;" data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f">
<pre><strong>Input:</strong> list1 = [1,2,4], list2 = [1,3,4]
<strong>Output:</strong> [1,1,2,3,4,4]
</pre>

<p data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f"><strong class="example" data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> list1 = [], list2 = []
<strong>Output:</strong> []
</pre>

<p data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f"><strong class="example" data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> list1 = [], list2 = [0]
<strong>Output:</strong> [0]
</pre>

<p data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f">&nbsp;</p>
<p data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f"><strong data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f">
	<li data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f" data-immersive-translate-paragraph="1">The number of nodes in both lists is in the range <code data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f">[0, 50]</code>.</li>
	<li data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f"><code data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f">-100 &lt;= Node.val &lt;= 100</code></li>
	<li data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f" data-immersive-translate-paragraph="1">Both <code data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f">list1</code> and <code data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f">list2</code> are sorted in <strong data-immersive-translate-walked="f945a3fe-ca47-4057-9a4b-435d377bf31f">non-decreasing</strong> order.</li>
</ul>
</div>