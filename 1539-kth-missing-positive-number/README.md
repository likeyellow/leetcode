<h2><a href="https://leetcode.com/problems/kth-missing-positive-number/">1539. Kth Missing Positive Number</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437"><p data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437" data-immersive-translate-paragraph="1">Given an array <code data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">arr</code> of positive integers sorted in a <strong data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">strictly increasing order</strong>, and an integer <code data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">k</code>.</p>

<p data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437" data-immersive-translate-paragraph="1">Return <em data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">the</em> <code data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">k<sup>th</sup></code> <em data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437"><strong data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">positive</strong> integer that is <strong data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">missing</strong> from this array.</em></p>

<p data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">&nbsp;</p>
<p data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437"><strong class="example" data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> arr = [2,3,4,7,11], k = 5
<strong>Output:</strong> 9
<strong>Explanation: </strong>The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5<sup>th</sup>&nbsp;missing positive integer is 9.
</pre>

<p data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437"><strong class="example" data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> arr = [1,2,3,4], k = 2
<strong>Output:</strong> 6
<strong>Explanation: </strong>The missing positive integers are [5,6,7,...]. The 2<sup>nd</sup> missing positive integer is 6.
</pre>

<p data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">&nbsp;</p>
<p data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437"><strong data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">
	<li data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437"><code data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">1 &lt;= arr.length &lt;= 1000</code></li>
	<li data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437"><code data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">1 &lt;= arr[i] &lt;= 1000</code></li>
	<li data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437"><code data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">1 &lt;= k &lt;= 1000</code></li>
	<li data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">arr[i] &lt; arr[j]</code> for <code data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">1 &lt;= i &lt; j &lt;= arr.length</code></li>
</ul>

<p data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437">&nbsp;</p>
<p data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437"><strong data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437" data-immersive-translate-paragraph="1">Follow up:</strong></p>

<p data-immersive-translate-walked="102cc0b1-5a3e-44e8-aee9-6b55858df437" data-immersive-translate-paragraph="1">Could you solve this problem in less than O(n) complexity?</p>
</div>