<h2><a href="https://leetcode.com/problems/contains-duplicate-ii/">219. Contains Duplicate II</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5"><p data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5" data-immersive-translate-paragraph="1">Given an integer array <code data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">nums</code> and an integer <code data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">k</code>, return <code data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">true</code> <em data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">if there are two <strong data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">distinct indices</strong> </em><code data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">i</code><em data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5"> and </em><code data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">j</code><em data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5"> in the array such that </em><code data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">nums[i] == nums[j]</code><em data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5"> and </em><code data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">abs(i - j) &lt;= k</code>.</p>

<p data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">&nbsp;</p>
<p data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5"><strong class="example" data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3,1], k = 3
<strong>Output:</strong> true
</pre>

<p data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5"><strong class="example" data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1,0,1,1], k = 1
<strong>Output:</strong> true
</pre>

<p data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5"><strong class="example" data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3,1,2,3], k = 2
<strong>Output:</strong> false
</pre>

<p data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">&nbsp;</p>
<p data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5"><strong data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">
	<li data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5"><code data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5"><code data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5"><code data-immersive-translate-walked="9fc2fc79-41d5-420f-abc3-b337410e87a5">0 &lt;= k &lt;= 10<sup>5</sup></code></li>
</ul>
</div>