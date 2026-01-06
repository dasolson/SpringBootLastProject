const {createApp, onMounted, ref} = Vue
			const {createPinia} = Pinia
			const jejuApp = createApp({
				setup() {
					const store = useJejuStore()
					const selectRef = ref('12')
					const findRef = ref('해수욕장')
					
					onMounted(() => {
						store.jejuFindData()
					})
					return {
						store,
						findRef,
						selectRef
					}
				}
			})
			jejuApp.use(createPinia())
			jejuApp.mount('#jeju_find')