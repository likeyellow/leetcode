<h2><a href="https://leetcode.com/problems/summary-ranges/">228. Summary Ranges</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198"><p data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198" data-immersive-translate-paragraph="1">You are given a <strong data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">sorted unique</strong> integer array <code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">nums</code>.</p>

<p data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198" data-immersive-translate-paragraph="1">A <strong data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">range</strong> <code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">[a,b]</code> is the set of all integers from <code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">a</code> to <code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">b</code> (inclusive).</p>

<p data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198" data-immersive-translate-paragraph="1">Return <em data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">the <strong data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">smallest sorted</strong> list of ranges that <strong data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">cover all the numbers in the array exactly</strong></em>. That is, each element of <code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">nums</code> is covered by exactly one of the ranges, and there is no integer <code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">x</code> such that <code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">x</code> is in one of the ranges but not in <code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">nums</code>.</p>

<p data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198" data-immersive-translate-paragraph="1">Each range <code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">[a,b]</code> in the list should be output as:</p>

<ul data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">
	<li data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">"a-&gt;b"</code> if <code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">a != b</code></li>
	<li data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">"a"</code> if <code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">a == b</code></li>
</ul>

<p data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">&nbsp;</p>
<p data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198"><strong class="example" data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [0,1,2,4,5,7]
<strong>Output:</strong> ["0-&gt;2","4-&gt;5","7"]
<strong>Explanation:</strong> The ranges are:
[0,2] --&gt; "0-&gt;2"
[4,5] --&gt; "4-&gt;5"
[7,7] --&gt; "7"
</pre>

<p data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198"><strong class="example" data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [0,2,3,4,6,8,9]
<strong>Output:</strong> ["0","2-&gt;4","6","8-&gt;9"]
<strong>Explanation:</strong> The ranges are:
[0,0] --&gt; "0"
[2,4] --&gt; "2-&gt;4"
[6,6] --&gt; "6"
[8,9] --&gt; "8-&gt;9"
</pre>

<p data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">&nbsp;</p>
<p data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198"><strong data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">
	<li data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198"><code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">0 &lt;= nums.length &lt;= 20</code></li>
	<li data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198"><code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
	<li data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198" data-immersive-translate-paragraph="1">All the values of <code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">nums</code> are <strong data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">unique</strong>.</li>
	<li data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="05b70575-61b4-45bc-9641-d88eae823198">nums</code> is sorted in ascending order.</li>
</ul>
</div>