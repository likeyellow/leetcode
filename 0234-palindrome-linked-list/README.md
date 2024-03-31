<h2><a href="https://leetcode.com/problems/palindrome-linked-list/">234. Palindrome Linked List</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1" data-immersive-translate-paragraph="1"><p data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1" data-immersive-translate-paragraph="1">Given the <code data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">head</code> of a singly linked list, return <code data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">true</code><em data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1"> if it is a </em><span data-keyword="palindrome-sequence" data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1"><em data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">palindrome</em></span><em data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1"> or </em><code data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">false</code><em data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1"> otherwise</em>.</p>

<p data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">&nbsp;</p>
<p data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1"><strong class="example" data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1" data-immersive-translate-paragraph="1">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/03/pal1linked-list.jpg" style="width: 422px; height: 62px;" data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">
<pre><strong>Input:</strong> head = [1,2,2,1]
<strong>Output:</strong> true
</pre>

<p data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1"><strong class="example" data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1" data-immersive-translate-paragraph="1">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/03/pal2linked-list.jpg" style="width: 182px; height: 62px;" data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">
<pre><strong>Input:</strong> head = [1,2]
<strong>Output:</strong> false
</pre>

<p data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">&nbsp;</p>
<p data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1"><strong data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">
	<li data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1" data-immersive-translate-paragraph="1">The number of nodes in the list is in the range <code data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">[1, 10<sup>5</sup>]</code>.</li>
	<li data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1"><code data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">0 &lt;= Node.val &lt;= 9</code></li>
</ul>

<p data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">&nbsp;</p>
<strong data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">Follow up:</strong> Could you do it in <code data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">O(n)</code> time and <code data-immersive-translate-walked="3f89c260-b8d0-479b-8c04-d76342aa62e1">O(1)</code> space?</div>