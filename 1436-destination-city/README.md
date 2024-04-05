<h2><a href="https://leetcode.com/problems/destination-city/">1436. Destination City</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff"><p data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff" data-immersive-translate-paragraph="1">You are given the array <code data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff">paths</code>, where <code data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff">paths[i] = [cityA<sub>i</sub>, cityB<sub>i</sub>]</code> means there exists a direct path going from <code data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff">cityA<sub>i</sub></code> to <code data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff">cityB<sub>i</sub></code>. <em data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff">Return the destination city, that is, the city without any path outgoing to another city.</em></p>

<p data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff" data-immersive-translate-paragraph="1">It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.</p>

<p data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff">&nbsp;</p>
<p data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff"><strong class="example" data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
<strong>Output:</strong> "Sao Paulo" 
<strong>Explanation:</strong> Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -&gt; "New York" -&gt; "Lima" -&gt; "Sao Paulo".
</pre>

<p data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff"><strong class="example" data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> paths = [["B","C"],["D","B"],["C","A"]]
<strong>Output:</strong> "A"
<strong>Explanation:</strong> All possible trips are:&nbsp;
"D" -&gt; "B" -&gt; "C" -&gt; "A".&nbsp;
"B" -&gt; "C" -&gt; "A".&nbsp;
"C" -&gt; "A".&nbsp;
"A".&nbsp;
Clearly the destination city is "A".
</pre>

<p data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff"><strong class="example" data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> paths = [["A","Z"]]
<strong>Output:</strong> "Z"
</pre>

<p data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff">&nbsp;</p>
<p data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff"><strong data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff">
	<li data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff"><code data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff">1 &lt;= paths.length &lt;= 100</code></li>
	<li data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff"><code data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff">paths[i].length == 2</code></li>
	<li data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff"><code data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff">1 &lt;= cityA<sub>i</sub>.length, cityB<sub>i</sub>.length &lt;= 10</code></li>
	<li data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff"><code data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff">cityA<sub>i</sub> != cityB<sub>i</sub></code></li>
	<li data-immersive-translate-walked="0a40462f-d007-4e06-859e-7ce5150781ff" data-immersive-translate-paragraph="1">All strings consist of lowercase and uppercase English letters and the space character.</li>
</ul>
</div>