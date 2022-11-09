<template>
  <div>
    <h1 class="underline">사용자 목록</h1>
    <div style="text-align: right">
      <button @click="movePage">회원가입</button>
    </div>
    <div v-if="users.length">
      <table id="user-list">
        <colgroup>
          <col style="width: 5%" />
          <col style="width: 10%" />
          <col style="width: 10%" />
          <col style="width: 15%" />
          <col style="width: 20%" />
          <col style="width: 20%" />
          <col style="width: 20%" />
        </colgroup>
        <thead>
          <tr>
            <th>번호</th>
            <th>아이디</th>
            <th>이름</th>
            <th>비밀번호</th>
            <th>이메일</th>
            <th>이메일 도메인</th>
            <th>가입날짜</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="(user, index) in users" :key="index">
            <td>{{ index + 1 }}</td>
            <td>{{ user.user_id }}</td>
            <td>{{ user.user_name }}</td>
            <td>{{ user.user_password }}</td>
            <td>{{ user.email_id }}</td>
            <td>{{ user.email_domain }}</td>
            <td>{{ user.join_date }}</td>
          </tr>
        </tbody>
      </table>
    </div>
    <div v-else class="text-center">등록된 사용자가 없습니다.</div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      users: [],
    };
  },
  created() {},
  methods: {
    movePage() {
      this.$router.push({ path: "/signup" });
    },
  },
};
</script>

<style></style>
