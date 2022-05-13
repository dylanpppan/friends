export <template>
  <p> hi </p>
  <div v-for="j in jjj" :key="j.id">  
    id: {{ j.id }}, name: {{ j.username }} 
    <br>
        <button @click="onClickDetail(j)">
            {{ j.username }}
        </button>
  </div>
</template>

<script>
import ky from 'ky';

var text = "1";

// (async () => {
//   text = await ky.get('http://localhost:8083/').json();
//   console.log(text)
// })();
 
export default {
  data(){
    return {
      jjj:{}
    }
  },
  async created(){
    text = await ky.get('http://localhost:8081/api/').json();
    console.log(text)
    this.jjj = text;
  },
  methods:{
    onClickDetail(friend){
      this.$router.push({ path: `/test/${friend.id}`});
    }
  }
}
</script>


<style>

</style>