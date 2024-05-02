<h2><a href="https://leetcode.com/problems/top-k-frequent-elements/">347. Top K Frequent Elements</a></h2><h3>Medium</h3><hr><div data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655"><p data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655" data-immersive-translate-paragraph="1">Given an integer array <code data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">nums</code> and an integer <code data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">k</code>, return <em data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">the</em> <code data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">k</code> <em data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">most frequent elements</em>. You may return the answer in <strong data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">any order</strong>.</p>

<p data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">&nbsp;</p>
<p data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655"><strong class="example" data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655" data-immersive-translate-paragraph="1">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [1,1,1,2,2,3], k = 2
<strong>Output:</strong> [1,2]
</pre><p data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655"><strong class="example" data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655" data-immersive-translate-paragraph="1">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [1], k = 1
<strong>Output:</strong> [1]
</pre>
<p data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">&nbsp;</p>
<p data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655"><strong data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">
	<li data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655"><code data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655"><code data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
	<li data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">k</code> is in the range <code data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">[1, the number of unique elements in the array]</code>.</li>
	<li data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655" data-immersive-translate-paragraph="1">It is <strong data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">guaranteed</strong> that the answer is <strong data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">unique</strong>.</li>
</ul>

<p data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">&nbsp;</p>
<p data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655" data-immersive-translate-paragraph="1"><strong data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">Follow up:</strong> Your algorithm's time complexity must be better than <code data-immersive-translate-walked="5962d366-4b69-4a7e-9642-8f4ce5a72655">O(n log n)</code>, where n is the array's size.</p>
</div>