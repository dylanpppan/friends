<template>
  <div class="center">
    <div class="vertical-menu" style="margin-left:auto; margin-right:auto;">
      <a href="#">id: {{ id }}</a>
      <a href="#">Name: {{ name }}</a>
    </div>
  </div>
</template>

<script>
export default {
  name: 'FriendDetails',
  props: ['id', 'name']
}
</script>

<style>

</style>