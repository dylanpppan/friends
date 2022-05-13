export <template>
  <div>
      <div> {{ friends }}</div>
      <p>{{ this.$route.params.id }}</p>
  </div>
</template>

<script>
import ky from 'ky';

export default {
  name:"MyTestSecond",
  data: () => ({
    friends: []
  }),
  async created() {
    const id = this.$route.params.id;
    this.friends = await ky.get(`http://localhost:8081/api/${id}`).json();
  }
}
</script>

<style>

</style>