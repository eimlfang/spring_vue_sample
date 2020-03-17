<template>
    <div class="home">
        <p>{{message}}</p>
        <el-button type="primary" @click="getMessage">{{message}}</el-button>
    </div>
</template>

<script>
    // @ is an alias to /src
    import HelloWorld from '@/components/HelloWorld.vue';

    export default {
        name: 'Home',
        data() {
            return {
                message: "按下",
            }
        },
        components: {
            HelloWorld,
        },
        methods: {
            getMessage() {
                this.message = "get...";
                setTimeout(this.doRequest, 1000);
            },
          doRequest() {
            this.$axios({
              method: "get",
              url: "/hello", // 接口地址
            })
                    .then(response => {
                      console.log(response, "success");   // 成功的返回
                        this.message = response.data;
                    })
                    .catch(error => console.log(error, "error")); // 失败的返回
          }
        }
    };
</script>
