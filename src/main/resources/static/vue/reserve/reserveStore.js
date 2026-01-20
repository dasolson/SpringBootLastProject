const {defineStore} = Pinia

const useReserveStore = defineStore('reserve', {
		state : () => ({
				loc_list : [
			  "강남구","강동구","강북구","강서구",
			  "관악구","광진구","구로구","금천구",
			  "노원구","도봉구","동대문구","동작구",
			  "마포구","서대문구","서초구","성동구",
			  "성북구","송파구","양천구","영등포구",
			  "용산구","은평구","종로구","중구","중랑구"
			  ],
				no : 0,
				loc : 'all',
				curpage : 1,
				totalpage : 0,
				food_list : [],
				image : 'data:image/jpeg;base64,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',
				title : '',
				day : '',
				time : '',
				inwon : '',
				isDate : true,
				isTime : false,
				isInwon : false,
				isReserveBtn : false,
				time_list : [], // 랜덤
				inwon_list : [
						"2명", "3명","4명", "5명", "6명", "7명", "8명", "9명", "단체"
				]
		}),
		actions : {
				async dataRecv() {
						const res = await api.get(
								'/reserve/food_list_vue/', {
										params : {
												page : this.curpage,
												address : this.loc
										}
								}
						)
						console.log(res.data)
						this.food_list = res.data.list
						this.loc = res.data.address
						this.curpage = res.data.curpage
						this.totalpage = res.data.totalpage
				},
				dateSelect(day) {
						this.day = day
				},
				prev() {
						this.curpage = this.curpage>1?this.curpage-1:this.curpage
						this.dataRecv()
				},
				next() {
						this.curpage = this.curpage<this.totalpage?this.curpage+1:this.curpage
						this.dataRecv()
				},
				locChange() {
						this.curpage = 1
						this.dataRecv()
				},
				foodSelect(no, title, poster) {
						this.no = no
						this.title = title
						this.image = poster
						this.isDate = true
				},
				timeSelect(time) {
						this.time = time
						this.isInwon = true
				},
				inwonSelect(inwon) {
						this.inwon = inwon
						this.isReserveBtn = true
				},
				async timeListData() {
						const res = await api.get('/reserve/time_list_vue/')
						this.time_list = res.data.list
						//this.isInwon = true
				},
				// 예약
				async reserveInsert() {
						const res = await api.post('/reserve/insert_vue/', {
								cno : this.no,
								rday : this.day,
								rtime : this.time,
								rinwon : this.inwon
						})
						if(res.data === 'YES') {
								location.href = "/mypage/mypage_reserve"
						}else {
								alert("예약에 실패했습니다.")
								this.title = ''
								this.image = 'data:image/jpeg;base64,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'
								this.time = ''
								this.inwon = ''
								this.isDate = false
								this.isTime = false
								thie.isInwon = false
								this.isReserveBtn = false
						}
				}
		}
})