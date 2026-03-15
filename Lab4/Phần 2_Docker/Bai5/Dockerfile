FROM golang:1.21

WORKDIR /app

COPY main.go .

RUN go mod init bai5
RUN go build -o app

CMD ["./app"]