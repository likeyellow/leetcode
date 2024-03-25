<h2><a href="https://leetcode.com/problems/missing-ranges/">163. Missing Ranges</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba"><p data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba" data-immersive-translate-paragraph="1">You are given an inclusive range <code data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">[lower, upper]</code> and a <strong data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">sorted unique</strong> integer array <code data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">nums</code>, where all elements are within the inclusive range.</p>

<p data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba" data-immersive-translate-paragraph="1">A number <code data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">x</code> is considered <strong data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">missing</strong> if <code data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">x</code> is in the range <code data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">[lower, upper]</code> and <code data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">x</code> is not in <code data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">nums</code>.</p>

<p data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba" data-immersive-translate-paragraph="1">Return <em data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">the <strong data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">shortest sorted</strong> list of ranges that <b data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">exactly covers all the missing numbers</b></em>. That is, no element of <code data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">nums</code> is included in any of the ranges, and each missing number is covered by one of the ranges.</p>

<p data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">&nbsp;</p>

<p data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">&nbsp;</p>
<p data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba"><strong class="example" data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [0,1,3,50,75], lower = 0, upper = 99
<strong>Output:</strong> [[2,2],[4,49],[51,74],[76,99]]
<strong>Explanation:</strong> The ranges are:
[2,2]
[4,49]
[51,74]
[76,99]
</pre>

<p data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba"><strong class="example" data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [-1], lower = -1, upper = -1
<strong>Output:</strong> []
<strong>Explanation:</strong> There are no missing ranges since there are no missing numbers.
</pre>

<p data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">&nbsp;</p>
<p data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba"><strong data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">
	<li data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba"><code data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">-10<sup>9</sup> &lt;= lower &lt;= upper &lt;= 10<sup>9</sup></code></li>
	<li data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba"><code data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">0 &lt;= nums.length &lt;= 100</code></li>
	<li data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba"><code data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">lower &lt;= nums[i] &lt;= upper</code></li>
	<li data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba" data-immersive-translate-paragraph="1">All the values of <code data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">nums</code> are <strong data-immersive-translate-walked="bca23684-d1de-4c62-8720-f9d2e65593ba">unique</strong>.</li>
</ul>
</div>