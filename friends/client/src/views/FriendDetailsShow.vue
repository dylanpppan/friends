<template>
  <div>
    <FriendDetails :id="id" :name="name"></FriendDetails>
  </div>
</template>

<script>
import FriendDetails from '@/components/FriendDetails.vue'

export default {
  name: 'FriendDetailsShow',
  components:{
    FriendDetails
  },
  data(){
    return {
      id: this.$route.params.id,
      name: this.$route.params.name
    }
  }
}
</script>

<style>
.center {
  margin: auto;
  background: grey;
  width: 40%;
  padding: 20px 50px;
}

a {
  text-decoration: none;
  display: inline-block;
  padding: 8px 16px;
}

a:hover {
  background-color: #ddd;
  color: black;
}

.previous {
  background-color: #f1f1f1;
  color: black;
}

.next {
  background-color: #04AA6D;
  color: white;
}

.round {
  border-radius: 50%;
}


.vertical-menu {
  width: 200px; /* Set a width if you like */
}

.vertical-menu a {
  background-color: #eee; /* Grey background color */
  color: black; /* Black text color */
  display: block; /* Make the links appear below each other */
  padding: 12px; /* Add some padding */
  text-decoration: none; /* Remove underline from links */
}

.vertical-menu a:hover {
  background-color: #ccc; /* Dark grey background on mouse-over */
}

.vertical-menu a.active {
  background-color: #04AA6D; /* Add a green color to the "active/current" link */
  color: white;
}

</style>