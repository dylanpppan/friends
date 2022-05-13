<template>
  <div class="friends">
    <FriendsList :friends="friends"></FriendsList>
  </div>
</template>


<script>
// @ is an alias to /src
import FriendsList from '@/components/FriendsList.vue'

export default {
  name: 'FriendsView',
  components: {
    FriendsList
  },

  data(){
    return {
      friends:[
        {id: 3, name : 'Tom', bday: '2000-04-05', food: 'Curry', animal: 'cat', comment: '123'},
        {id: 4, name: 'Chris', bday: '1999-06-22', food: 'Ramen', animal: 'dog', comment: '456'}
      ]
    }
  }
}
</script>