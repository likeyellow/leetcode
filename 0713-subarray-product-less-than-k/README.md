<h2><a href="https://leetcode.com/problems/subarray-product-less-than-k/">713. Subarray Product Less Than K</a></h2><h3>Medium</h3><hr><div data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b"><p data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b" data-immersive-translate-paragraph="1">Given an array of integers <code data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b">nums</code> and an integer <code data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b">k</code>, return <em data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b">the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than </em><code data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b">k</code>.</p>

<p data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b">&nbsp;</p>
<p data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b"><strong class="example" data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [10,5,2,6], k = 100
<strong>Output:</strong> 8
<strong>Explanation:</strong> The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
</pre>

<p data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b"><strong class="example" data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3], k = 0
<strong>Output:</strong> 0
</pre>

<p data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b">&nbsp;</p>
<p data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b"><strong data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b">
	<li data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b"><code data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b">1 &lt;= nums.length &lt;= 3 * 10<sup>4</sup></code></li>
	<li data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b"><code data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b">1 &lt;= nums[i] &lt;= 1000</code></li>
	<li data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b"><code data-immersive-translate-walked="27b8ef74-9ab3-4c54-b8d9-b03e962e948b">0 &lt;= k &lt;= 10<sup>6</sup></code></li>
</ul>
</div>