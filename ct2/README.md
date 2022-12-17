# Case study 2
### Đề bài:
- Xây dựng 1 trò chơi trắc nghiệm Ai là triệu phú sử dụng màn hình console
### Yêu cầu cơ bản:
- Không sử dụng thư viện ngoài.
- Thiết kế và thi công tuân theo các quy tắc của hướng đối tượng.
- Giao diện hiển thị tiếng Việt không dấu, dễ sử dụng.
### Yêu cầu nghiệp vụ:
- Trò chơi bao gồm 1 bộ câu hỏi có 3 mức: Dễ, Trung Bình, Khó.
- Dữ liệu câu hỏi sử dụng lưu trong File và phải có hành động đọc File.
- 1 Game gồm 15 câu hỏi ngẫu nhiên không trùng nhau: câu 1-5 thuộc mức Dễ, câu 6-10 thuộc mức Trung Bình, câu 11-15 thuộc mức Khó.
- Mỗi một câu người dùng có quyền chọn đáp án hoặc dừng cuộc chơi: 
    + Chọn đúng đi tới câu tiếp theo cho đến khi hết 15 câu.
    + Chọn sai sẽ kết thúc trò chơi, điểm số là các mốc 0, 5, 10 đã đạt được gần nhất.
    + Chọn dừng cuộc chơi sẽ kết thúc trò chơi, điểm số là điểm của câu hỏi liền trước.
    + Chọn đúng câu 15 sẽ kết thúc trò chơi, điểm số là điểm của câu hỏi 15.
- Mức điểm tham khảo chương trình Ai là triệu phú hiện hành.
- Sau khi kết thúc trò chơi sẽ trực tiếp in số điểm ra màn hình, đồng thời có lựa chọn chơi tiếp hoặc kết thúc trò chơi.
## Yêu cầu đặc biệt:
- DỄ SỬ DỤNG: nếu người dùng không thể sử dụng hoặc khó sử dụng sẽ trực tiếp failed mà không cần xem code. (Cần tham khảo các trò chơi tương tự xem họ hành xử như nào, từ đó chuyển đổi về cho ứng dụng của mình)
