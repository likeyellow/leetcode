<h2><a href="https://leetcode.com/problems/transpose-matrix/">867. Transpose Matrix</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f"><p data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f" data-immersive-translate-paragraph="1">Given a 2D integer array <code data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f">matrix</code>, return <em data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f">the <strong data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f">transpose</strong> of</em> <code data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f">matrix</code>.</p>

<p data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f" data-immersive-translate-paragraph="1">The <strong data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f">transpose</strong> of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.</p>

<p data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f"><img alt="" src="https://assets.leetcode.com/uploads/2021/02/10/hint_transpose.png" style="width: 600px; height: 197px;" data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f"></p>

<p data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f">&nbsp;</p>
<p data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f"><strong class="example" data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> matrix = [[1,2,3],[4,5,6],[7,8,9]]
<strong>Output:</strong> [[1,4,7],[2,5,8],[3,6,9]]
</pre>

<p data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f"><strong class="example" data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> matrix = [[1,2,3],[4,5,6]]
<strong>Output:</strong> [[1,4],[2,5],[3,6]]
</pre>

<p data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f">&nbsp;</p>
<p data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f"><strong data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f">
	<li data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f"><code data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f">m == matrix.length</code></li>
	<li data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f"><code data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f">n == matrix[i].length</code></li>
	<li data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f"><code data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f">1 &lt;= m, n &lt;= 1000</code></li>
	<li data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f"><code data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f">1 &lt;= m * n &lt;= 10<sup>5</sup></code></li>
	<li data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f"><code data-immersive-translate-walked="c49924ec-a3c1-4556-aec8-822a4808180f">-10<sup>9</sup> &lt;= matrix[i][j] &lt;= 10<sup>9</sup></code></li>
</ul>
</div>