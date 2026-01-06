const {createApp, onMounted, ref} = Vue
			const {createPinia} = Pinia
			const seoulApp = createApp({
				setup() {
					// store 읽기
					const store = useSeoulStore()
					const addressRef = ref('마포')					
					// ref 읽기
					// onMounted()
					onMounted(() => {
						store.seoulFindData()
					})
					// return
					return {
						store,
						addressRef
					}
				}
			})
			seoulApp.use(createPinia())
			seoulApp.mount('#seoul_find')