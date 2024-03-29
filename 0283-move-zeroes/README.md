<h2><a href="https://leetcode.com/problems/move-zeroes/">283. Move Zeroes</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056" data-immersive-translate-paragraph="1"><p data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056" data-immersive-translate-paragraph="1">Given an integer array <code data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056">nums</code>, move all <code data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056">0</code>'s to the end of it while maintaining the relative order of the non-zero elements.</p>

<p data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056" data-immersive-translate-paragraph="1"><strong data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056">Note</strong> that you must do this in-place without making a copy of the array.</p>

<p data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056">&nbsp;</p>
<p data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056"><strong class="example" data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056" data-immersive-translate-paragraph="1">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [0,1,0,3,12]
<strong>Output:</strong> [1,3,12,0,0]
</pre><p data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056"><strong class="example" data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056" data-immersive-translate-paragraph="1">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [0]
<strong>Output:</strong> [0]
</pre>
<p data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056">&nbsp;</p>
<p data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056"><strong data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056">
	<li data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056"><code data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056">1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056"><code data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056">-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

<p data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056">&nbsp;</p>
<strong data-immersive-translate-walked="707818f7-f6f5-4e35-b671-0dd904aeb056">Follow up:</strong> Could you minimize the total number of operations done?</div>