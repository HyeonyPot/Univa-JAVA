getwd()
install.packages("rvest")
library(rvest)

url_base<-
  'https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?code=167613&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false&page='

all.reviews<-c()
for(page in 1:25){
  url <- paste(url_base,page,sep='')
  htxt <- read_html(url)
  table <- html_nodes(htxt,'.score_reple')
  content<-html_nodes(table,'span')
  reviews<-html_text(content)
  if(length(reviews)==0){break}
  all.reviews<-c(all.reviews,reviews)
  print(page)
  
  
}

write.table(all.reviews,'naver.txt')
